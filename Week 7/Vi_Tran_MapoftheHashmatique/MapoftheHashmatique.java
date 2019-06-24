public class MapOfHashmatique{
        
        
        public static void main(String[] args){
             HashMap<String, String> tracklist = new HashMap();
           
        tracklist.put("Feeling Good","It's a new dawn. It's a new day. It's a new life. For me and I'm feeling good. I'm feeling good");
        tracklist.put("Come Fly With Me", "Come fly with me, let's fly let's fly away");
        tracklist.put("Send My Love", "I'm giving you up. I've forgiven it all. You set me free, oh");
        tracklist.put("Make You Feel My Love", "I could make you happy, make your dreams come true There's nothing that I wouldn't do");
       
        String pulledOutSong = tracklist.get("Send My Love");
        System.out.println(lyric);
 
        for(HashMap.Entry<String,String> track:  tracklist.entrySet()){
            System.out.println(" Title : " + track.getKey() + " Lyrics:" + track.getValue());
        }

    }
}


