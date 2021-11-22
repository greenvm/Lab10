class Sugar extends Cookie{
  String cookieShape;
  boolean isDecorated;

  Sugar(){
    cookieShape = "";
    isDecorated = false;
  }

  Sugar(String newCookieShape, boolean newIsDecorated){
    cookieShape = newCookieShape;
    isDecorated = newIsDecorated; 
  }

  public String getCookieShape(){
    return cookieShape;
  }

  public void setCookieShape(String cookieShape) {
    this.cookieShape = cookieShape;
  }

  void cutCookieShape(String newCookieShape, int newTotalCookies){
    super.setTotalCookies(newTotalCookies);
    System.out.println(totalCookies + " coookies were cut into " + newCookieShape + ".");
  }

  void decorateCookies(){
    if(super.isReady() == true){
      isDecorated = true;
      System.out.println("The cookies have been decorated.");
    }
    else{
      System.out.println("The cookies have not yet been cooked.");
    }
}