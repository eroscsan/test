import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

import org.junit.Assert;
import org.junit.Test;

public class SpriteTest {

	@Test
	public void test() {
		Sprite sprite = new Sprite(new TestImage());
			
		Assert.assertEquals(200, sprite.getHeight());
		Assert.assertEquals(100, sprite.getWidth());
		
	}
}


class TestImage extends Image {
	@Override
	public int getWidth(ImageObserver observer) {
		return 100;
	}
	
	@Override
	public ImageProducer getSource() {
		return null;
	}
	
	@Override
	public Object getProperty(String name, ImageObserver observer) {
		return "Test";
	}
	
	@Override
	public int getHeight(ImageObserver observer) {
		return 200;
	}
	
	@Override
	public Graphics getGraphics() {
		return null;
	}
}
