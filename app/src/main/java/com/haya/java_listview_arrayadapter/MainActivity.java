package com.haya.java_listview_arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

  private static final String[] texts = {
      // Globe Decade の楽曲リストより
      "Feel Like dance",
      "Joy to the love (globe)",
      "SWEET PAIN",
      "DEPARTURES (RADIO EDIT)",
      "FREEDOM (RADIO EDIT)",
      "Is this love",
      "Can't Stop Fallin' in Love",
      "FACE",
      "FACES PLACES",
      "Anytime smokin' cigarette",
      "Wanderin' Destiny",
      "Love again",
      "wanna Be A Dreammaker",
      "Sa Yo Na Ra",
      "sweet heart",
      "Perfume of love",
      "MISS YOUR BODY",
      "still growin' up",
      "biting her nails",
      "とにかく無性に…"
  };

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    // listビュー
    ListView listView = new ListView(this);
    setContentView(listView);

    // simple_list_item_1 は、 もともと用意されている定義済みのレイアウトファイルのID
    ArrayAdapter<String> arrayAdapter =
        new ArrayAdapter<>(this, R.layout.list, texts);

    // activity_main で 作成された listViewに arrayAdapter でセットされた texts を 代入している。
    listView.setAdapter(arrayAdapter);

  }
}