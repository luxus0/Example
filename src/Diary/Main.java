package Diary;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String args[])
    {
        Map<Integer,DiaryNote> diaryNoteMap = new HashMap<>();

        DiaryNote diaryNote = new DiaryNote("happy","cloudy",4);
        DiaryNote diaryNote2 = new DiaryNote("crancy","rainy",2);
        DiaryNote diaryNote3 = new DiaryNote("annoyed","sunny",1);
        DiaryNote diaryNote4 = new DiaryNote("joyful","cloudy",5);

        diaryNoteMap.put(3,diaryNote);
        diaryNoteMap.put(6,diaryNote2);
        diaryNoteMap.put(7,diaryNote3);
        diaryNoteMap.put(10,diaryNote4);

        for (Map.Entry<Integer,DiaryNote> entry : diaryNoteMap.entrySet())
        {
            Integer dayOfMoth = entry.getKey();
            DiaryNote diary = entry.getValue();

            //use key and value
            System.out.println(dayOfMoth + diary.toString());
        }





    }
}
