import io.github.mhamooei.Config;
import io.github.mhamooei.models.Attack;
import io.github.mhamooei.models.Slice;
import io.github.mhamooei.utils.AttackCollection;
import io.github.mhamooei.utils.SliceCollection;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CollectionsTest {
    @Test
    public void containsAttackTest(){
        List<Attack> attacks = new ArrayList<>();
        attacks.add(new Attack("a", Config.passedLabel));
        attacks.add(new Attack("b", Config.passedLabel));
        attacks.add(new Attack("cc", Config.passedLabel));
        attacks.add(new Attack("d", Config.passedLabel));
        attacks.add(new Attack("e", Config.passedLabel));
        attacks.add(new Attack("f", Config.passedLabel));
        assertFalse(AttackCollection.containsAttack(attacks, "c"));
        assertTrue(AttackCollection.containsAttack(attacks, "cc"));

    }
    @Test
    public void containsSliceTest(){
        List<Slice> slices = new ArrayList<>();
        slices.add(new Slice("a","a","a"));
        slices.add(new Slice("b","b","b"));
        slices.add(new Slice("cc","cc","cc"));
        slices.add(new Slice("d","e","e"));
        slices.add(new Slice("f","f","f"));
        slices.add(new Slice("g","g","g"));
        assertFalse(SliceCollection.containsSlice(slices, "c"));
        assertTrue(SliceCollection.containsSlice(slices, "cc"));

    }
}
