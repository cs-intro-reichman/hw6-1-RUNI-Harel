import java.awt.Color;


public class Editor4 {
    public static void main(String[] args) {
        // getting data
        String sourceFileName = args[0];
        int n = Integer.parseInt(args[1]);

        Color[][] sourceImage = Runigram.read(sourceFileName);
        
        // Create grayscale version
        Color[][] targetImage = Runigram.grayScaled(sourceImage);

        Runigram.setCanvas(sourceImage);

        // Morph
        Runigram.morph(sourceImage, targetImage, n);
    }
}
