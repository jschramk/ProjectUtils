import java.io.File;
import java.io.IOException;

public class Test {


    public static void main(String[] args) throws IOException {

        //WaveFile.BINtoBinaryTxt(new File("src/processed.txt"), new File("src/processed.bin"));

        //WaveFile.BinaryTxtToBIN(new File("src/processed.txt"), new File("src/processed.bin"));

        //WaveFile.writeTestWaveBIN(new File("src/test_wave_440.bin"), 440, 10000, 44100 * 2);
        //WaveFile.BINtoWAV(new File("src/test_wave_440.bin"), new File("src/test_wave_440.wav"));
        //WaveFile.WAVtoBIN(new File("src/ghu_unedited_full.wav"), new File("src/ghu_unedited_full.bin"));
        //WaveFile.BINtoBinaryTxt(new File("src/ghu_unedited_full.bin"), new File("src/ghu_unedited_full.txt"));
        //WaveFile.BinaryTxtToBIN(new File("src/ghu_unedited_full.txt"), new File("src/ghu_unedited_full_from_txt.bin")); // <- issue?
        //WaveFile.BINtoWAV(new File("src/ghu_unedited_full_from_txt.bin"), new File("src/ghu_unedited_full_from_txt.wav"));
        WaveFile.BinaryTxtToBIN(new File("src/processed.txt"), new File("src/processed.bin")); // <- issue?
        WaveFile.BINtoWAV(new File("src/processed.bin"), new File("src/processed.wav"));

        //WaveFile.BINtoBinaryTxt(new File("src/ghu_unedited.bin"), new File("src/ghu_unedited.txt"));

        //WaveFile.fromWAV(new File("src/ghu_unedited.wav"));

        //WaveFile.fromWAV(new File("src/processed.wav"));



    }


}
