package nyc.c4q.fragment1203inclass;

import android.content.Context;
import android.content.res.Resources;

/**
 * Created by yokilam on 12/3/17.
 */

public class CheckingInput {
    private String editTextString;
    private Resources resources;

    public CheckingInput(Resources resources, String editTextString) {
        this.resources = resources;
        this.editTextString = editTextString;
    }

    public String changingText(String editTextString){
        String newString;

        switch (editTextString) {
            case "red":
                newString= resources.getString(R.string.red);
                break;
            case "yellow":
                newString= resources.getString(R.string.yellow);
                break;
            case "blue":
                newString= resources.getString(R.string.blue);
                break;
            default:
                newString= resources.getString(R.string.try_something_else);
                break;
        }

        return newString;
    }
}
