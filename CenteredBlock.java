package csc207.sunhaoru.layout;

public class CenteredBlock implements TextBlock {
  TextBlock tb;
  int width;

  public CenteredBlock(TextBlock tb, int width) {
    this.tb = tb;
    this.width = width;
  }

  public String row(int i) throws Exception {
    String centered = null;
    int h = this.tb.height();
    if ((i >= 0) && (i < h)) {
      int space = (this.width - this.tb.row(i).length())/2;
      centered = TBUtils.spaces(space) + this.tb.row(i) + TBUtils.spaces(space);
      return centered;
    } else {
      throw new Exception("Invalid row " + i);
    }
  }

  public int height() {
    return this.tb.height();
  }

  @Override
  public int width() {
    return this.width;
  }

}
