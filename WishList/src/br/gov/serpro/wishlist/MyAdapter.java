package br.gov.serpro.wishlist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.content.Context;
import android.provider.MediaStore.Images;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {

	private Context context;
	private List<String> data;
	private Map<String, String> map;

	public MyAdapter(Context context, List<String> data) {
		this.data = data;
		this.context = context;
		map = new HashMap<String, String>();
	}
	
	public MyAdapter(Context context) {
		this.context = context;
		map = new HashMap<String, String>();
	}
	
	public void add(String titulo, String autor){
		map.put(titulo, autor);
	}

	@Override
	public int getCount() {
		return data.size();
	}

	@Override
	public Object getItem(int position) {
		return data.get(position);
	}
	
	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {

			LayoutInflater inflater = LayoutInflater.from(context);
			convertView = inflater.inflate(R.layout.list_item, null);

			TextView text = (TextView) convertView
					.findViewById(R.id.list_item_textview);
			text.setText((String) getItem(position));

			TextView autor = (TextView) convertView
					.findViewById(R.id.list_item_autor);
			autor.setText("Stephenie Meyer");

		}

		return convertView;
	}

}
