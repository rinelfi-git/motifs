package img.motifs;

public class Launcher {
	public static void main(String... args) {
		final int motifRepetition = 2;
		final MotifGenerator motifGenerator = new MotifGenerator("[#]", 10).setMirror(true);
		
		for(int triangle = 1; triangle <= motifRepetition; triangle++) motifGenerator.printHorizontal();
	}
}
