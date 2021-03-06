package de.agilecoders.wicket.core.markup.html.bootstrap.layout;

import de.agilecoders.wicket.core.WicketApplicationTest;
import org.apache.wicket.util.tester.TagTester;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Tests the {@link ContainerBehavior}
 */
public class ContainerBehaviorTest extends WicketApplicationTest {

    @Test
    public void defaultLayoutIsFixed() {
        assertThat(new ContainerBehavior().layout(), is(equalTo(Layout.Fixed)));
    }

    @Test
    public void layoutFixedIsSet() {
        startBehaviorInPage(new ContainerBehavior(Layout.Fixed));

        TagTester tagTester = tester().getTagByWicketId(id());
        assertCssClass(tagTester, "container");
    }

    @Test
    public void layoutFluidIsSet() {
        startBehaviorInPage(new ContainerBehavior(Layout.Fluid));

        TagTester tagTester = tester().getTagByWicketId(id());
        assertCssClass(tagTester, "container-fluid");
    }
}
