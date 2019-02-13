package csc207.sunhaoru.layout;

public class Grid implements TextBlock {

  int width;
  int height;
  char ch;

  public Grid(int width, int height, char ch) {
    this.width = width;
    this.height = height;
    this.ch = ch;
  }

  public String row(int i) throws Exception {
    /*
     * String result = Character.toString(ch); int h = this.height; int w = this.width; if (i < h) {
     * for (int j = 1; j < w; j++) { result += ch; } } return result;
     */
    // The top and bottom of the box\
    String result = Character.toString(ch);
    int h = this.height;
    int w = this.width;


    // Stuff within the box
    if ((i >= 0) && (i < h)) {
      for (int j = 1; j < w; j++) {
        result += ch;
      }
      return result;
    }
    // Everything else
    else {
      throw new Exception("Invalid row " + i);
    }
  } // row(int)


  // The top and bottom of the box
  /*
   * if ((i == 0) || (i == h + 1)) { return "+" + TBUtils.dashes(this.width()) + "+"; } // Stuff
   * within the box else if ((i > 0) && (i <= h)) { return "|" + this.row(i - 1) + "|"; } //
   * Everything else else { throw new Exception("Invalid row " + i); }
   */


  public int height() {
    return this.height;
  }

  public int width() {
    return this.width;
  }

}
