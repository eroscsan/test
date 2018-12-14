import org.junit.Assert;
import org.junit.Test;

public class SpriteStoreTest {

	SpriteStore underTest;
	
	@Test
	public void test() {
		underTest = SpriteStore.get();
		
		Sprite sprite = underTest.getSprite("alien.gif");
		Assert.assertEquals(43, sprite.getWidth());
		Assert.assertEquals(29, sprite.getHeight());
	}

}

