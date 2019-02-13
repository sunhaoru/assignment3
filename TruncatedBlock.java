package csc207.sunhaoru.layout;

public class TruncatedBlock implements TextBlock {

  TextBlock tb;
  int width;

  public TruncatedBlock(TextBlock tb, int width) {
    this.tb = tb;
    this.width = width;
  }

  public String row(int i) throws Exception {
    String truncated = null;
    int h = this.tb.height();
    if ((i >= 0) && (i < h)) {
      truncated = this.tb.row(i).substring(0, this.width);
      return truncated;
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
