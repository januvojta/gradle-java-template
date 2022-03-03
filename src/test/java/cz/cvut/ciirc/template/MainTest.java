package cz.cvut.ciirc.template;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MainTest {

    @Test
    public void add() {
        assertThat(Main.add(5,5)).isEqualTo(10);
        assertThat(Main.add(100,-100)).isNotNull();
    }
}
