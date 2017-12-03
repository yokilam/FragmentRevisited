package nyc.c4q.fragment1203inclass;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView= inflater.inflate(R.layout.fragment_main, container, false);

        Button enter= rootView.findViewById(R.id.enter);
        final EditText editText= rootView.findViewById(R.id.edit_text);

        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                NextFragment nextFragment= new NextFragment();
                FragmentManager fragmentManager= getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();

                fragmentTransaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);

                Bundle bundle = new Bundle();
                bundle.putString("input", editText.getText().toString());
                nextFragment.setArguments(bundle);

                fragmentTransaction.replace(R.id.fragment_container, nextFragment).addToBackStack("next").commit();
                editText.setText("");
            }
        });

        return rootView;
    }

}
