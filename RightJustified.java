package csc207.sunhaoru.layout;

public class RightJustified implements TextBlock {

  TextBlock tb;
  int width;

  public RightJustified(TextBlock tb, int width) {
    this.tb = tb;
    this.width = width;
  }

  public String row(int i) throws Exception {
    String right;
    int h = this.tb.height();
    if ((i >= 0) && (i < h)) {
      int l = this.tb.row(i).length();
      if (l > this.width) {
        throw new Exception("Invalid width" + this.width);
      } else {
        right = TBUtils.spaces(this.width - l) + this.tb.row(i);
        return right;
      }
    } else {
      throw new Exception("Invalid row " + i);
    }
  }

  public int height() {
    return this.tb.height();
  }

  public int width() {
    return this.width;
  }

}
