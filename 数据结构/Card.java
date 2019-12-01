public class Card {
    int rank;
    String color;
    public Card(int rank,String color){
        this.rank=rank;
        this.color=color;
    }
    @Override
    public String toString(){
        String valueStr=null;
        if(rank==1){
            valueStr="A";
            }
            else if(rank>10) {
                  if(rank==11)
                      valueStr="J";
                  else if(rank==12)
                      valueStr="Q";
                  else  if (rank==13)
                      valueStr="K";
                  }
                  else{
            valueStr=String.valueOf(rank);
        }
        return String.format("(%s,%s)",valueStr,color);

        }

    }
