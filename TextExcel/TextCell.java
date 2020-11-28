public class TextCell implements Cell {
   
   public String abbreviatedCellText(){
   
     return "test";
   }
   
                                              // text for spreadsheet cell display, must be exactly length 10
	public String fullCellText(){
   
      return "tesesstst"; // text for individual cell inspection, not truncated or padded

   }
}