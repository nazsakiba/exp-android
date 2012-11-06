package br.gov.serpro.wishlist;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragListWish extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.frag_list_wish, null);
		
		ListView listView = (ListView) view.findViewById(R.id.listView);

		List<String> data = new ArrayList<String>();
		data.add("Crepúsculo");
		data.add("Lua Nova");
		data.add("Eclipse");
		data.add("Amanhecer");
		MyAdapter adapter = new MyAdapter(getActivity(), data);
//		MyAdapter adapter = new MyAdapter(getActivity());
//		adapter.add("Crepúsculo", "Stephenie Meyer");

		listView.setAdapter(adapter);		
		
		return view;

	}

}
