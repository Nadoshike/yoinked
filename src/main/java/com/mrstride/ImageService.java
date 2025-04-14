package com.mrstride;

import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

@Service
public class ImageService {

    public BufferedImage getImage() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream("images/test-image.png");
        if (stream == null) {
            throw new IOException("Image not found!");
        }
        BufferedImage image = ImageIO.read(stream);

      
        System.out.println("Image Loaded Successfully!");
        System.out.println("Width: " + image.getWidth());
        System.out.println("Height: " + image.getHeight());
        System.out.println("Color Model: " + image.getColorModel());

        return image;
    }
}
