package csc207.sunhaoru.layout;

public class CComposition implements TextBlock{

 TextBlock block;
 int width;
 public CComposition (TextBlock block, int width) {
   this.block = block;
   this.width = width;
 }
 
  public String row(int i) throws Exception {
    // TODO Auto-generated method stub
    return null;
  }

 
  public int height() {
    // TODO Auto-generated method stub
    return this.block.height();
  }

 
  public int width() {
    // TODO Auto-generated method stub
    return this.block.width();
  }

  
}
