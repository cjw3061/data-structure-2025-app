package io.mobile.board;

public class HashMapBoard implements Board {
   final Map<String BoardInfo map>

    public hashmapboard(){
       this.map = new hashmap();
    }

    public void add(final BoardInfo boardinfo){
       void.map.put(boardinfo.getSubject(), boardinfo)
    }

    public void print(){
//       set<String> keys = this.map.KeySet();
//       for(String key:keys){
//           System.out.println(this.map.get(key));
//       }
        collection<BoardInfo> values = this.map.values();
        for(boardinfo value: values){
            System.out.println(value);
        }
   }

    override
    public void add(boardinfo boardinfo){
       this.map.put(boardInfo.getsubjefct(), boardinfo)
    }

    @Override
    public Boardinfo find(String Subject) {
        return this.map.get(subject);
    }

    find()
}
