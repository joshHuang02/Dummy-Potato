class Butt {
 //instance variables
 private int cheekSizeInch;
 private int anusSizeInch;
 private int poopSizeInch;
 private String texture;
 private boolean hairy;
 private boolean healthy;
 
 //constructors
 public Butt(int cheekSizeInch, int anusSizeInch, int poopSizeInch) {
   this.cheekSizeInch = cheekSizeInch;
   this.anusSizeInch = anusSizeInch;
   this.poopSizeInch = poopSizeInch;
   this.texture = "Smooth";
   this.hairy = false;
   this.healthy = true;
 }
 public Butt(int cheekSizeInch, int anusSizeInch, int poopSizeInch, String texture, boolean hairy, boolean healthy) {
   this.cheekSizeInch = cheekSizeInch;
   this.anusSizeInch = anusSizeInch;
   this.poopSizeInch = poopSizeInch;
   this.texture = texture;
   this.hairy = hairy;
   this.healthy = healthy;
 }
 
 //methods
 public String injure() {
     healthy = false;
     return "Please contact nearby Medicare.";
 }

 public String excrete() {
   if(poopSizeInch > anusSizeInch || (healthy == false)) {
     return injure() + "You now have hemorrhoids.";
   }
   else
     return "Successful excretion!";
   }
 
 public String fart(){
   if(healthy){
   if (Math.random() > 0.6) {
     if (!(texture.equals("Smooth") || cheekSizeInch > 10)) {
       return "Flubflubflubflub";
     }
      else if (hairy) {
       return "Pffffft!";
     } 
     else {
     return "Toot!";
     }
   }
   else
   return "You cannot fart at this time. " + injure();
 }
    else
 return "You cannot fart at this time. " + injure();
 }
 
 public String heal() {
   healthy = true;
   return "Your butt is now functional. ($799)";
 }

 public String scratch() {
   if(healthy){
   if ((hairy && poopSizeInch <= anusSizeInch) && healthy) {
     if (Math.random() > 0.8) {
     return "You have scratched your butt.";
     }
   } if (!hairy && poopSizeInch <= anusSizeInch) {
     return "You pondered scratching, but there is no need.";
   } else {
     return injure() + "You want to scratch, but you have hemorrhoids.";
   }}
   else
   return injure();
 }
 
 //texture methods (not influenced by functionality of butt)
 public String healTexture() {
   if (texture.equals("Smooth")) {
     return "Your butt is already smooth.";
   } else {
     this.texture = "Smooth";
     return "Your butt is now smooth.";
   }
 }
 
 public String injureTexture() {
   this.texture = "Not smooth";
   return "Your butt is not smooth.";
 }
 
 //setters and gettesr
 public int getCheekSizeInch() {
   return cheekSizeInch;
 }
 public void setAnusSizeInch(int anusSizeInch) {
   this.anusSizeInch = anusSizeInch;
 }
 public int getAnusSizeInch() {
   return anusSizeInch;
 }
 public void setPoopSizeInch(int poopSizeInch) {
   this.poopSizeInch = poopSizeInch;
 }
 public int getPoopSizeInch() {
   return poopSizeInch;
 }
 public void setTexture(String texture) {
   this.texture = texture;
 }
  public String getTexture() {
   return texture;
 }
 public void setHairy(boolean hairy) {
   this.hairy = hairy;
 }
  public void setCheekSizeInch(int cheekSizeInch) {
   this.cheekSizeInch = cheekSizeInch;
 }
 public String getHairy() {
   if (hairy) {
     return "This butt is hairy.";
   } else {
     return "This butt is not hairy.";
   }
 }
}
