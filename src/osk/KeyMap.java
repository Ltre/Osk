package osk;
//假名和键值的映射
import java.util.HashMap;

public class KeyMap extends HashMap{

    public KeyMap() {
        init();
    }
    
    private void init(){
        
        //The first line
        this.put("`", "ろ");
        this.put("1", "ぬ");
        this.put("2", "ふ");
        this.put("3", "あ");
        this.put("4", "う");
        this.put("5", "え");
        this.put("6", "お");
        this.put("7", "や");
        this.put("8", "ゆ");
        this.put("9", "よ");
        this.put("0", "わ");
        this.put("-", "ほ");
        this.put("=", "へ");
        
        //The second line
        this.put("q", "た");
        this.put("w", "て");
        this.put("e", "い");
        this.put("r", "す");
        this.put("t", "か");
        this.put("y", "ん");
        this.put("u", "な");
        this.put("i", "に");
        this.put("o", "ら");
        this.put("p", "せ");
        this.put("[", "゛");
        this.put("]", "゜");
        this.put("\\", "む");
        
        //The third line
        this.put("a", "ち");
        this.put("s", "と");
        this.put("d", "し");
        this.put("f", "は");
        this.put("g", "き");
        this.put("h", "く");
        this.put("j", "ま");
        this.put("k", "の");
        this.put("l", "り");
        this.put(";", "れ");
        this.put("'", "け");
        
        //The fourth line
        this.put("z", "つ");
        this.put("x", "さ");
        this.put("c", "そ");
        this.put("v", "ひ");
        this.put("b", "こ");
        this.put("n", "み");
        this.put("m", "も");
        this.put(",", "ね");
        this.put(".", "る");
        this.put("/", "め");
        
        this.put(" ", " ");        
    }
    
}
