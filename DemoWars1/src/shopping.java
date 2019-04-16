import com.borland.silktest.jtf.BrowserBaseState;
import org.junit.Before;
import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.DomElement;
import com.borland.silktest.jtf.xbrowser.DomButton;
import com.borland.silktest.jtf.xbrowser.DomLink;
import com.borland.silktest.jtf.Desktop;

public class shopping {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'http://nimbusserver:8000/#/'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void speakers() {
		desktop.<DomElement>find("nimbusserver.BrowserWindow.20").click();
		desktop.<DomElement>find("nimbusserver.BrowserWindow.#54B3AD").click();
		desktop.<DomElement>find("nimbusserver.BrowserWindow.speakersImg").click();
		desktop.<DomElement>find("nimbusserver.BrowserWindow.20").click();
		desktop.<DomButton>find("nimbusserver.BrowserWindow.save_to_cart").click();
		desktop.<DomElement>find("nimbusserver.BrowserWindow.menuCart").click();
		desktop.<DomLink>find("nimbusserver.BrowserWindow.REMOVE").click();
		desktop.<DomLink>find("nimbusserver.BrowserWindow.CONTINUE SHOPPING").click();
	}

}