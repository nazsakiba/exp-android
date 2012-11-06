//package br.gov.serpro.wishlist;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import android.app.Activity;
//import android.os.Bundle;
//import android.view.Menu;
//import android.widget.ExpandableListView;
//import android.widget.GridView;
//import android.widget.ListView;
//import android.widget.SimpleAdapter;
//import android.widget.Spinner;
//
//public class CopyOfListWish extends Activity {
//
//	@Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_list_wish);
//        
//        ListView listView = (ListView) findViewById(R.id.listView);
//        /* 
//         * List View com ArrayAdapter 
//         * */
////        String[] data = new String[]{"Ednara","Nara","Narinha"};
////        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.list_item, R.id.list_item_textview, data);
//        
//        /* 
//         * List View com SimpleCursor 
//         * */
//        
////        MatrixCursor cursor = new MatrixCursor(new String[]{"_id","nome"});
////        cursor.addRow(new String[]{"1","Ednara"});
////        cursor.addRow(new String[]{"2","Nara"});
////        cursor.addRow(new String[]{"3","Narinha"});
////        String[] from = new String[]{"nome"};
////        int[] to = new int[]{R.id.list_item_textview};
////        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this, R.layout.list_item, cursor, from, to, 0);
//        
//        List<String> data = new ArrayList<String>();
//        data.add("Crepúsculo");
//        data.add("Lua Nova");
//        data.add("Eclipse");
//        data.add("Amanhecer");
//        MyAdapter adapter = new MyAdapter(this, data);
//        
//        listView.setAdapter(adapter);
//        /*
//         * Spinner com SimpleAdapter
//         * */
//        
////        Spinner spinner = (Spinner) findViewById(R.id.spinner);
////
////        Map<String, String> valo1 = new HashMap<String, String>();
////        valo1.put("nome", "Ednara");
////        Map<String, String> valor2 = new HashMap<String, String>();
////        valor2.put("nome", "Eliene");
////        List<Map<String, String>> lista = new ArrayList<Map<String,String>>();
////        lista.add(valo1);
////        lista.add(valor2);
////
////        String[] from2 = new String[]{"nome"};
////        int[] to2 = new int[]{android.R.id.text1};
////        
////        SimpleAdapter adapter2 = new SimpleAdapter(this, lista, android.R.layout.simple_list_item_1, from2, to2);
////        spinner.setAdapter(adapter2);
//        
////        ExpandableListView listView = (ExpandableListView) findViewById(R.id.listView);
////        List<String> list  = new ArrayList<String>();
////        list.add("Crepúsculo");
////        list.add("Lua Nova");
////        list.add("Eclipse");
////        list.add("Amanhecer");
////        Map<String, List<String>> map = new HashMap<String, List<String>>();
////
////		map.put("Livros", list);
////        
////        ExpListAdapter adapter = new ExpListAdapter(this, map);
////        listView.setAdapter(adapter);
//        
//    }
//
//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		getMenuInflater().inflate(R.menu.activity_list_wish, menu);
//		return true;
//	}
//}
