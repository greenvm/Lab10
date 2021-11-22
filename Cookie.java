class Cookie {
  int totalCookies; 
  double bakeTime;
  double bakeTemp;
  boolean isReady;

  Cookie(){
    totalCookies = 0;
    bakeTime = 0;
    bakeTemp = 0;
    isReady = false;
  }


  Cookie(int newTotalCookies, double newBakeTemp, double newBakeTime, boolean newIsReady){
    totalCookies = newTotalCookies;
    bakeTemp = newBakeTemp;
    bakeTime = newBakeTime;
    isReady = newIsReady;
  }

  boolean isReady(){
    return isReady;
  }

  void setTotalCookies (int newTotalCookies){
    totalCookies = newTotalCookies; 
  }

  void bakeCookies(double newBakeTemp, double newBakeTime){
    System.out.println(totalCookies + " cookies were bakes at " + newBakeTemp + " degrees F for " + newBakeTime + " minutes.");
    isReady = true;
  }
}