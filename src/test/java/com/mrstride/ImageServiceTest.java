package com.mrstride;

import org.junit.Test;

import java.awt.image.BufferedImage;

import static org.junit.Assert.*;

public class ImageServiceTest {

    @Test
    public void testGetImage() throws Exception {
        ImageService imageService = new ImageService();

        BufferedImage image = imageService.getImage();

        // Basic validations
        assertNotNull("Image should not be null", image);
        assertTrue("Image width should be greater than 0", image.getWidth() > 0);
        assertTrue("Image height should be greater than 0", image.getHeight() > 0);

        // Print for confirmation
        System.out.println(" Image loaded successfully in test!");
        System.out.println("Width: " + image.getWidth());
        System.out.println("Height: " + image.getHeight());
        System.out.println("Color Model: " + image.getColorModel().toString());
    }
}
