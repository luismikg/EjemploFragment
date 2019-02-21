package mx.ipn.com.repeatejemplofragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_Left extends Fragment {

    Button button1;

    public Fragment_Left() {
        // Required empty public constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;

        view = inflater.inflate(R.layout.fragment_fragment__left, container, false);
        button1 = view.findViewById(R.id.button1);
        return view;
    }
}
