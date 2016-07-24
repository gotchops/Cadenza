package controller;

import java.util.HashMap;
import java.util.Random;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * 
 * Allows access to images used by Cadenza
 *
 */
class ImagePath {
	enum note {
		CFLAT, C, CSHARP,
		DFLAT, D, DSHARP,
		EFLAT, E, ESHARP,
		FFLAT, F, FSHARP,
		GFLAT, G, GSHARP,
		AFLAT, A, ASHARP,
		BFLAT, B, BSHARP
	}
	
	enum key {
		CFLAT_AFLAT, C_A, CSHARP_ASHARP,
		DFLAT_BFLAT, D_B, G_E, A_FSHARP,
		E_CSHARP, B_GSHARP, FSHARP_DSHARP,
		F_D, BFLAT_G, EFLAT_C, AFLAT_F, GFLAT_EFLAT
	}
	
	private static final String IMG_PATH = "../../bin/res/";
	private static final String IMG_EXTENSION = ".png";
	private static final HashMap<String, note> IMG_TO_NOTE;
	private static final HashMap<String, key> IMG_TO_KEY;
	private static final HashMap<String, note> PIANO_TO_NOTE;
	private static final Object[] NOTE_IMG_PATHS;
	private static final Object[] KEY_IMG_PATHS;
	private static final Object[] PIANO_IMG_PATHS;
	
	static {
		IMG_TO_NOTE = new 
				HashMap<String, note>();
		IMG_TO_NOTE.put(IMG_PATH + "a1" + IMG_EXTENSION, note.A);
		IMG_TO_NOTE.put(IMG_PATH + "a2" + IMG_EXTENSION, note.A);
		IMG_TO_NOTE.put(IMG_PATH + "a3b" + IMG_EXTENSION, note.A);
		IMG_TO_NOTE.put(IMG_PATH + "a3t" + IMG_EXTENSION, note.A);
		IMG_TO_NOTE.put(IMG_PATH + "a4" + IMG_EXTENSION, note.A);
		IMG_TO_NOTE.put(IMG_PATH + "a5" + IMG_EXTENSION, note.A);
		IMG_TO_NOTE.put(IMG_PATH + "asharp1" + IMG_EXTENSION, note.ASHARP);
		IMG_TO_NOTE.put(IMG_PATH + "asharp2" + IMG_EXTENSION, note.ASHARP);
		IMG_TO_NOTE.put(IMG_PATH + "asharp3b" + IMG_EXTENSION, note.ASHARP);
		IMG_TO_NOTE.put(IMG_PATH + "asharp3t" + IMG_EXTENSION, note.ASHARP);
		IMG_TO_NOTE.put(IMG_PATH + "asharp4" + IMG_EXTENSION, note.ASHARP);
		IMG_TO_NOTE.put(IMG_PATH + "asharp5" + IMG_EXTENSION, note.ASHARP);
		IMG_TO_NOTE.put(IMG_PATH + "aflat1" + IMG_EXTENSION, note.AFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "aflat2" + IMG_EXTENSION, note.AFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "aflat3b" + IMG_EXTENSION, note.AFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "aflat3t" + IMG_EXTENSION, note.AFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "aflat4" + IMG_EXTENSION, note.AFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "aflat5" + IMG_EXTENSION, note.AFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "b1" + IMG_EXTENSION, note.B);
		IMG_TO_NOTE.put(IMG_PATH + "b2" + IMG_EXTENSION, note.B);
		IMG_TO_NOTE.put(IMG_PATH + "b3b" + IMG_EXTENSION, note.B);
		IMG_TO_NOTE.put(IMG_PATH + "b3t" + IMG_EXTENSION, note.B);
		IMG_TO_NOTE.put(IMG_PATH + "b4" + IMG_EXTENSION, note.B);
		IMG_TO_NOTE.put(IMG_PATH + "b5" + IMG_EXTENSION, note.B);
		IMG_TO_NOTE.put(IMG_PATH + "bsharp1" + IMG_EXTENSION, note.BSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "bsharp2" + IMG_EXTENSION, note.BSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "bsharp3b" + IMG_EXTENSION, note.BSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "bsharp3t" + IMG_EXTENSION, note.BSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "bsharp4" + IMG_EXTENSION, note.BSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "bsharp5" + IMG_EXTENSION, note.BSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "bflat1" + IMG_EXTENSION, note.BFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "bflat2" + IMG_EXTENSION, note.BFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "bflat3b" + IMG_EXTENSION, note.BFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "bflat3t" + IMG_EXTENSION, note.BFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "bflat4" + IMG_EXTENSION, note.BFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "bflat5" + IMG_EXTENSION, note.BFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "c2" + IMG_EXTENSION, note.C);
		IMG_TO_NOTE.put(IMG_PATH + "c3" + IMG_EXTENSION, note.C);
		IMG_TO_NOTE.put(IMG_PATH + "c4b" + IMG_EXTENSION, note.C);
		IMG_TO_NOTE.put(IMG_PATH + "c4t" + IMG_EXTENSION, note.C);
		IMG_TO_NOTE.put(IMG_PATH + "c5" + IMG_EXTENSION, note.C);
		IMG_TO_NOTE.put(IMG_PATH + "c6" + IMG_EXTENSION, note.C);
		IMG_TO_NOTE.put(IMG_PATH + "csharp2" + IMG_EXTENSION, note.CSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "csharp3" + IMG_EXTENSION, note.CSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "csharp4b" + IMG_EXTENSION, note.CSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "csharp4t" + IMG_EXTENSION, note.CSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "csharp5" + IMG_EXTENSION, note.CSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "csharp6" + IMG_EXTENSION, note.CSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "cflat2" + IMG_EXTENSION, note.CFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "cflat3" + IMG_EXTENSION, note.CFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "cflat4b" + IMG_EXTENSION, note.CFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "cflat4t" + IMG_EXTENSION, note.CFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "cflat5" + IMG_EXTENSION, note.CFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "cflat6" + IMG_EXTENSION, note.CFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "d2" + IMG_EXTENSION, note.D);
		IMG_TO_NOTE.put(IMG_PATH + "d3" + IMG_EXTENSION, note.D);
		IMG_TO_NOTE.put(IMG_PATH + "d4b" + IMG_EXTENSION, note.D);
		IMG_TO_NOTE.put(IMG_PATH + "d4t" + IMG_EXTENSION, note.D);
		IMG_TO_NOTE.put(IMG_PATH + "d5" + IMG_EXTENSION, note.D);
		IMG_TO_NOTE.put(IMG_PATH + "d6" + IMG_EXTENSION, note.D);
		IMG_TO_NOTE.put(IMG_PATH + "dsharp2" + IMG_EXTENSION, note.DSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "dsharp3" + IMG_EXTENSION, note.DSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "dsharp4b" + IMG_EXTENSION, note.DSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "dsharp4t" + IMG_EXTENSION, note.DSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "dsharp5" + IMG_EXTENSION, note.DSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "dsharp6" + IMG_EXTENSION, note.DSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "dflat2" + IMG_EXTENSION, note.DFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "dflat3" + IMG_EXTENSION, note.DFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "dflat4b" + IMG_EXTENSION, note.DFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "dflat4t" + IMG_EXTENSION, note.DFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "dflat5" + IMG_EXTENSION, note.DFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "dflat6" + IMG_EXTENSION, note.DFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "e2" + IMG_EXTENSION, note.E);
		IMG_TO_NOTE.put(IMG_PATH + "e3" + IMG_EXTENSION, note.E);
		IMG_TO_NOTE.put(IMG_PATH + "e4b" + IMG_EXTENSION, note.E);
		IMG_TO_NOTE.put(IMG_PATH + "e4t" + IMG_EXTENSION, note.E);
		IMG_TO_NOTE.put(IMG_PATH + "e5" + IMG_EXTENSION, note.E);
		IMG_TO_NOTE.put(IMG_PATH + "e6" + IMG_EXTENSION, note.E);
		IMG_TO_NOTE.put(IMG_PATH + "esharp2" + IMG_EXTENSION, note.ESHARP);
		IMG_TO_NOTE.put(IMG_PATH + "esharp3" + IMG_EXTENSION, note.ESHARP);
		IMG_TO_NOTE.put(IMG_PATH + "esharp4b" + IMG_EXTENSION, note.ESHARP);
		IMG_TO_NOTE.put(IMG_PATH + "esharp4t" + IMG_EXTENSION, note.ESHARP);
		IMG_TO_NOTE.put(IMG_PATH + "esharp5" + IMG_EXTENSION, note.ESHARP);
		IMG_TO_NOTE.put(IMG_PATH + "esharp6" + IMG_EXTENSION, note.ESHARP);
		IMG_TO_NOTE.put(IMG_PATH + "eflat2" + IMG_EXTENSION, note.EFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "eflat3" + IMG_EXTENSION, note.EFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "eflat4b" + IMG_EXTENSION, note.EFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "eflat4t" + IMG_EXTENSION, note.EFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "eflat5" + IMG_EXTENSION, note.EFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "eflat6" + IMG_EXTENSION, note.EFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "f2" + IMG_EXTENSION, note.F);
		IMG_TO_NOTE.put(IMG_PATH + "f3b" + IMG_EXTENSION, note.F);
		IMG_TO_NOTE.put(IMG_PATH + "f3t" + IMG_EXTENSION, note.F);
		IMG_TO_NOTE.put(IMG_PATH + "f4b" + IMG_EXTENSION, note.F);
		IMG_TO_NOTE.put(IMG_PATH + "f4t" + IMG_EXTENSION, note.F);
		IMG_TO_NOTE.put(IMG_PATH + "f5" + IMG_EXTENSION, note.F);
		IMG_TO_NOTE.put(IMG_PATH + "fsharp2" + IMG_EXTENSION, note.FSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "fsharp3b" + IMG_EXTENSION, note.FSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "fsharp3t" + IMG_EXTENSION, note.FSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "fsharp4b" + IMG_EXTENSION, note.FSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "fsharp4t" + IMG_EXTENSION, note.FSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "fsharp5" + IMG_EXTENSION, note.FSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "fflat2" + IMG_EXTENSION, note.FFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "fflat3b" + IMG_EXTENSION, note.FFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "fflat3t" + IMG_EXTENSION, note.FFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "fflat4b" + IMG_EXTENSION, note.FFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "fflat4t" + IMG_EXTENSION, note.FFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "fflat5" + IMG_EXTENSION, note.FFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "g2" + IMG_EXTENSION, note.G);
		IMG_TO_NOTE.put(IMG_PATH + "g3b" + IMG_EXTENSION, note.G);
		IMG_TO_NOTE.put(IMG_PATH + "g3t" + IMG_EXTENSION, note.G);
		IMG_TO_NOTE.put(IMG_PATH + "g4b" + IMG_EXTENSION, note.G);
		IMG_TO_NOTE.put(IMG_PATH + "g4t" + IMG_EXTENSION, note.G);
		IMG_TO_NOTE.put(IMG_PATH + "g5" + IMG_EXTENSION, note.G);
		IMG_TO_NOTE.put(IMG_PATH + "gsharp2" + IMG_EXTENSION, note.GSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "gsharp3b" + IMG_EXTENSION, note.GSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "gsharp3t" + IMG_EXTENSION, note.GSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "gsharp4b" + IMG_EXTENSION, note.GSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "gsharp4t" + IMG_EXTENSION, note.GSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "gsharp5" + IMG_EXTENSION, note.GSHARP);
		IMG_TO_NOTE.put(IMG_PATH + "gflat2" + IMG_EXTENSION, note.GFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "gflat3b" + IMG_EXTENSION, note.GFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "gflat3t" + IMG_EXTENSION, note.GFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "gflat4b" + IMG_EXTENSION, note.GFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "gflat4t" + IMG_EXTENSION, note.GFLAT);
		IMG_TO_NOTE.put(IMG_PATH + "gflat5" + IMG_EXTENSION, note.GFLAT);
		
		NOTE_IMG_PATHS = IMG_TO_NOTE.keySet().toArray();
	}
	
	static {
		IMG_TO_KEY = new HashMap<String, key>();
		IMG_TO_KEY.put(IMG_PATH + "cflataflat" + IMG_EXTENSION, key.CFLAT_AFLAT);
		IMG_TO_KEY.put(IMG_PATH + "ca" + IMG_EXTENSION, key.C_A);
		IMG_TO_KEY.put(IMG_PATH + "csharpasharp" + IMG_EXTENSION, key.CSHARP_ASHARP);
		IMG_TO_KEY.put(IMG_PATH + "dflatbflat" + IMG_EXTENSION, key.DFLAT_BFLAT);
		IMG_TO_KEY.put(IMG_PATH + "db" + IMG_EXTENSION, key.D_B);
		IMG_TO_KEY.put(IMG_PATH + "ge" + IMG_EXTENSION, key.G_E);
		IMG_TO_KEY.put(IMG_PATH + "afsharp" + IMG_EXTENSION, key.A_FSHARP);
		IMG_TO_KEY.put(IMG_PATH + "ecsharp" + IMG_EXTENSION, key.E_CSHARP);
		IMG_TO_KEY.put(IMG_PATH + "bgsharp" + IMG_EXTENSION, key.B_GSHARP);
		IMG_TO_KEY.put(IMG_PATH + "fsharpdsharp" + IMG_EXTENSION, key.FSHARP_DSHARP);
		IMG_TO_KEY.put(IMG_PATH + "fd" + IMG_EXTENSION, key.F_D);
		IMG_TO_KEY.put(IMG_PATH + "bflatg" + IMG_EXTENSION, key.BFLAT_G);
		IMG_TO_KEY.put(IMG_PATH + "eflatc" + IMG_EXTENSION, key.EFLAT_C);
		IMG_TO_KEY.put(IMG_PATH + "aflatf" + IMG_EXTENSION, key.AFLAT_F);
		IMG_TO_KEY.put(IMG_PATH + "gflateflat" + IMG_EXTENSION, key.GFLAT_EFLAT);
		
		KEY_IMG_PATHS = IMG_TO_KEY.keySet().toArray();
	}
	
	static {
		PIANO_TO_NOTE = new HashMap<String, note>();
		PIANO_TO_NOTE.put(IMG_PATH + "c1k" + IMG_EXTENSION, note.C);
		PIANO_TO_NOTE.put(IMG_PATH + "d1k" + IMG_EXTENSION, note.D);
		PIANO_TO_NOTE.put(IMG_PATH + "e1k" + IMG_EXTENSION, note.E);
		PIANO_TO_NOTE.put(IMG_PATH + "f1k" + IMG_EXTENSION, note.F);
		PIANO_TO_NOTE.put(IMG_PATH + "g1k" + IMG_EXTENSION, note.G);
		PIANO_TO_NOTE.put(IMG_PATH + "a1k" + IMG_EXTENSION, note.A);
		PIANO_TO_NOTE.put(IMG_PATH + "b1k" + IMG_EXTENSION, note.B);
		PIANO_TO_NOTE.put(IMG_PATH + "csdf1k" + IMG_EXTENSION, note.CSHARP);
		PIANO_TO_NOTE.put(IMG_PATH + "dsef1k" + IMG_EXTENSION, note.DSHARP);
		PIANO_TO_NOTE.put(IMG_PATH + "fsgf1k" + IMG_EXTENSION, note.FSHARP);
		PIANO_TO_NOTE.put(IMG_PATH + "gsaf1k" + IMG_EXTENSION, note.GSHARP);
		PIANO_TO_NOTE.put(IMG_PATH + "asbf1k" + IMG_EXTENSION, note.ASHARP);
		PIANO_TO_NOTE.put(IMG_PATH + "c2k" + IMG_EXTENSION, note.C);
		PIANO_TO_NOTE.put(IMG_PATH + "d2k" + IMG_EXTENSION, note.D);
		PIANO_TO_NOTE.put(IMG_PATH + "e2k" + IMG_EXTENSION, note.E);
		PIANO_TO_NOTE.put(IMG_PATH + "f2k" + IMG_EXTENSION, note.F);
		PIANO_TO_NOTE.put(IMG_PATH + "g2k" + IMG_EXTENSION, note.G);
		PIANO_TO_NOTE.put(IMG_PATH + "a2k" + IMG_EXTENSION, note.A);
		PIANO_TO_NOTE.put(IMG_PATH + "b2k" + IMG_EXTENSION, note.B);
		PIANO_TO_NOTE.put(IMG_PATH + "csdf2k" + IMG_EXTENSION, note.CSHARP);
		PIANO_TO_NOTE.put(IMG_PATH + "dsef2k" + IMG_EXTENSION, note.DSHARP);
		PIANO_TO_NOTE.put(IMG_PATH + "fsgf2k" + IMG_EXTENSION, note.FSHARP);
		PIANO_TO_NOTE.put(IMG_PATH + "gsaf2k" + IMG_EXTENSION, note.GSHARP);
		PIANO_TO_NOTE.put(IMG_PATH + "asbf2k" + IMG_EXTENSION, note.ASHARP);
		
		PIANO_IMG_PATHS = PIANO_TO_NOTE.keySet().toArray();
	}
	
	/**
	 * Sets a random note image to be displayed by an ImageView
	 * @param imageView a not null ImageView
	 * @return The note name corresponding to the image
	 */
	public static note setRandomNoteImage(ImageView imageView) {
		Random r = new Random();
		int upperBound = IMG_TO_NOTE.size() - 1;
		int index = r.nextInt(upperBound);
		String filePath = ((String) NOTE_IMG_PATHS[index]);
		Image img = new Image("file:" + filePath);
		imageView.setImage(img);
		return IMG_TO_NOTE.get(NOTE_IMG_PATHS[index]);
	}
	
	/**
	 * Sets a random key signature image to be displayed by an ImageView
	 * @param imageView a not null ImageView
	 * @return the key associated with the image
	 */
	public static key setRandomKeyImage(ImageView imageView) {
		Random r = new Random();
		int upperBound = IMG_TO_KEY.size() - 1;
		int index = r.nextInt(upperBound);
		String filePath = ((String) KEY_IMG_PATHS[index]);
		Image img = new Image("file:" + filePath);
		imageView.setImage(img);
		return IMG_TO_KEY.get(KEY_IMG_PATHS[index]);
	}
	
	/**
	 * Sets an ImageView to display a random image of a piano key
	 * @param imageView a not null ImageView
	 * @return the note name corresponding to the piano key image
	 */
	public static note setRandomPianoNoteImage(ImageView imageView) {
		Random r = new Random();
		int upperBound = PIANO_TO_NOTE.size() - 1;
		int index = r.nextInt(upperBound);
		String filePath = ((String) PIANO_IMG_PATHS[index]);
		Image img = new Image("file:" + filePath);
		imageView.setImage(img);
		return PIANO_TO_NOTE.get(PIANO_IMG_PATHS[index]);
	}
}
