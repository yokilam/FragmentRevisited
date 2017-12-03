package nyc.c4q.fragment1203inclass;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class NextFragment extends Fragment {


    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView= inflater.inflate(R.layout.fragment_next, container, false);

        TextView show= rootView.findViewById(R.id.display);

        Bundle bundle= getArguments();
        if (bundle != null) {
            String userInput = bundle.getString("input");
            if (userInput!= null  && !userInput.isEmpty()) {
                CheckingInput checkingInput= new CheckingInput(getResources(), userInput);
                String newInput= checkingInput.changingText(userInput);
                show.setText(newInput);
            }
        }
        return rootView;
    }

}
