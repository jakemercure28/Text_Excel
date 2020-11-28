public class EmptyCell implements Cell {
   
   public String abbreviatedCellText() {          // text for spreadsheet cell display, must be exactly length 10
       String half = "";
       return half;
   }                                            
	
   public String fullCellText(){                 // text for individual cell inspection, not truncated or padded
      String full = "";
      return full;
   }
}