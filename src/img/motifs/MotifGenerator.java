package img.motifs;

public class MotifGenerator {
	private String motif;
	private int lines;
	private boolean mirror;
	
	public MotifGenerator() {
		this.motif = "*";
		this.mirror = false;
	}
	
	public MotifGenerator(int lines) {
		this.motif = "*";
		this.lines = lines;
		this.mirror = false;
	}
	
	public MotifGenerator(String motif, int lines) {
		this.motif = motif;
		this.lines = lines;
		this.mirror = false;
	}
	
	public final String getMotif() {
		return motif;
	}
	
	public MotifGenerator setMotif(String motif) {
		this.motif = motif;
		return this;
	}
	
	public final int getLines() {
		return lines;
	}
	
	public MotifGenerator setLines(int lines) {
		this.lines = lines;
		return this;
	}
	
	public MotifGenerator setMirror(boolean mirror) {
		this.mirror = mirror;
		return this;
	}
	
	public final void printVertical() {
		if (!this.mirror) {
			for (int line = 1; line <= lines; line++) {
				for (int column = 1; column <= line; column++) {
					System.out.print(this.motif);
				}
				System.out.println();
			}
		} else {
			for (int line = 1; line <= lines; line++) {
				for (int column = 1; column <= line; column++) {
					System.out.print(this.motif);
				}
				System.out.println();
			}
			for (int line = lines + 1; line > 0; line--) {
				for (int column = 1; column <= line; column++) {
					System.out.print(this.motif);
				}
				System.out.println();
			}
		}
	}
	
	public final void printHorizontal() {
		if(!this.mirror) {
			for (int line = 1; line <= lines; line++) {
				for (int column = this.lines - line; column > 0; column--) {
					for(int space = 1; space <= this.motif.length(); space++) System.out.print(" ");
				}
				for (int column = 1; column <= line; column++) {
					System.out.print(this.motif);
				}
				System.out.println();
			}
		} else {
			for (int line = 1; line <= lines; line++) {
				for (int column = this.lines - line; column > 0; column--) {
					for(int space = 1; space <= this.motif.length(); space++) System.out.print(" ");
				}
				for (int column = 2; column <= line * 2; column++) {
					System.out.print(this.motif);
				}
				System.out.println();
			}
		}
	}
}
