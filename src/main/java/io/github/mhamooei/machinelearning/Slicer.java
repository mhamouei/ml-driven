package io.github.mhamooei.machinelearning;

import io.github.mhamooei.Main;
import io.github.mhamooei.antlrparser.InjectionLexer;
import io.github.mhamooei.antlrparser.InjectionParser;
import io.github.mhamooei.models.Attack;
import io.github.mhamooei.models.Slice;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;

public class Slicer {
    private List<String> attackSlice;
    public void slice(){
        //List<Attack> modifiedAttacks = new ArrayList<>();
        for (Attack attack : Main.trainData){
            attack.clearSlices();
            CharStream in = CharStreams.fromString(attack.getAttack());
            InjectionLexer lexer = new InjectionLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            InjectionParser parser = new InjectionParser(tokens);
            ParseTree parseTree = parser.start();
            attackSlice = new ArrayList<>();
            decompose(parseTree, parser);
            attack.setSlices(attackSlice);
        }
    }

    public void resetSlices() {
        Slice.slices.clear();
        for (Attack attack : Main.trainData)
            attack.clearSlices();
        slice();
    }
    private void decompose(ParseTree tree, InjectionParser parser) {
        ParseTree context = tree.getChild(0);
        int count = context.getChildCount();
        for (int i = 0; i < count; i++) {
            visit(context.getChild(i), parser);
        }
    }
    private void visit(ParseTree tree, InjectionParser parser)  {
        String s = tree.toStringTree(parser);
        String parent = tree.getParent().toStringTree(parser);
        parent = parent.substring(1, parent.indexOf(' '));
        String slice = s.substring(1, s.indexOf(' ')) + "." + parent + "." + tree.getText();
        //System.out.println(slice);

        if (!Slice.slices.contains(slice)) {
            Slice.slices.add(slice);

            //Main.db.insertSlice(s,tree.getText());
        }
        if (!attackSlice.contains(slice))
            attackSlice.add(slice);
        if (isMinimal(tree)) {
            //System.out.println(slices.get(slices.indexOf(s)));
            return;
        }
        else {
            int count = tree.getChildCount();
            for (int i=0; i < count; i++){
                visit(tree.getChild(i),parser);
            }
        }

    }
    private boolean isMinimal(ParseTree tree){
        return tree.getChild(0).getChildCount() == 0;
    }

}
