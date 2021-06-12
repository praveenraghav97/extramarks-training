class Checker{
    Comparator<Player> desc =  new Comparator<Player>() {
     public int compare(Player p1, Player p2)  {
          if(p2.score - p1.score != 0){
             return p2.score - p1.score;
          }
          return p2.name.compareTo(p1.name);
      }
    };
}
