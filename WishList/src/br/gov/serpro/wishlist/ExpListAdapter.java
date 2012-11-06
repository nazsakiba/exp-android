package br.gov.serpro.wishlist;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

public class ExpListAdapter extends BaseExpandableListAdapter {

	private Context context;
	private Map<String, List<String>> map;
	
	public ExpListAdapter(Context context, Map<String, List<String>> map) {
		this.context = context;
		this.map = map;
	}

	@Override
	public Object getChild(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public long getChildId(int groupPosition, int childPosition) {
		return childPosition;
	}

	@Override
	public View getChildView(int groupPosition, int childPosition,
			boolean isLastChild, View convertView, ViewGroup parent) {
		TextView text = new TextView(context);
		text.setText("Eclipse");
		
		return text;
	}

	@Override
	public int getChildrenCount(int groupPosition) {
		return 10;
	}

	@Override
	public Object getGroup(int groupPosition) {
		return "Grupo";
	}

	@Override
	public int getGroupCount() {
		return 3;
	}

	@Override
	public long getGroupId(int groupPosition) {
		return groupPosition;
	}

	@Override
	public View getGroupView(int groupPosition, boolean isExpanded,
			View convertView, ViewGroup parent) {
//		TextView text = new TextView(context);
//		text.setText("Livros");
		LayoutInflater inflater = LayoutInflater.from(context);
		convertView = inflater.inflate(R.layout.list_item, null);
		
		TextView text = (TextView)convertView.findViewById(R.id.list_item_textview);
		text.setText("Livros");
		
		return convertView;
	}

	@Override
	public boolean hasStableIds() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isChildSelectable(int groupPosition, int childPosition) {
		// TODO Auto-generated method stub
		return false;
	}

}
