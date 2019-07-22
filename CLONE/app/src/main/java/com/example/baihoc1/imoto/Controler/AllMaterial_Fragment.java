package com.example.baihoc1.imoto.Controler;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.baihoc1.imoto.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AllMaterial_Fragment extends Fragment {

    View vRoot;
    RecyclerView rvAllMaterial;


    public AllMaterial_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        vRoot = inflater.inflate(R.layout.fragment_all_material, container, false);
        init();
        allMaterial ();
        return vRoot;
    }

    private void allMaterial() {


    }

    private void init() {

        rvAllMaterial = vRoot.findViewById(R.id.rv_all_material);

        class GetAllMaterial {
            String bikeId, SearchKey, Page;

            public GetAllMaterial (String bikeId, String searchKey, String page){
                this.bikeId = bikeId;
                SearchKey = searchKey;
                Page = page;
            }

        }

    }

}
