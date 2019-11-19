package grack.dev.creditpointapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import grack.dev.creditpointapp.databinding.ActivityLoginBindingImpl;
import grack.dev.creditpointapp.databinding.FragmentDataInformasiBindingImpl;
import grack.dev.creditpointapp.databinding.FragmentDataPelanggaranBindingImpl;
import grack.dev.creditpointapp.databinding.FragmentKelasBindingImpl;
import grack.dev.creditpointapp.databinding.ItemDataInformasiBindingImpl;
import grack.dev.creditpointapp.databinding.ItemDataPelanggaranBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYLOGIN = 1;

  private static final int LAYOUT_FRAGMENTDATAINFORMASI = 2;

  private static final int LAYOUT_FRAGMENTDATAPELANGGARAN = 3;

  private static final int LAYOUT_FRAGMENTKELAS = 4;

  private static final int LAYOUT_ITEMDATAINFORMASI = 5;

  private static final int LAYOUT_ITEMDATAPELANGGARAN = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.fragment_data_informasi, LAYOUT_FRAGMENTDATAINFORMASI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.fragment_data_pelanggaran, LAYOUT_FRAGMENTDATAPELANGGARAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.fragment_kelas, LAYOUT_FRAGMENTKELAS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.item_data_informasi, LAYOUT_ITEMDATAINFORMASI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.item_data_pelanggaran, LAYOUT_ITEMDATAPELANGGARAN);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDATAINFORMASI: {
          if ("layout/fragment_data_informasi_0".equals(tag)) {
            return new FragmentDataInformasiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_data_informasi is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDATAPELANGGARAN: {
          if ("layout/fragment_data_pelanggaran_0".equals(tag)) {
            return new FragmentDataPelanggaranBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_data_pelanggaran is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTKELAS: {
          if ("layout/fragment_kelas_0".equals(tag)) {
            return new FragmentKelasBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_kelas is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDATAINFORMASI: {
          if ("layout/item_data_informasi_0".equals(tag)) {
            return new ItemDataInformasiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_data_informasi is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDATAPELANGGARAN: {
          if ("layout/item_data_pelanggaran_0".equals(tag)) {
            return new ItemDataPelanggaranBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_data_pelanggaran is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_login_0", grack.dev.creditpointapp.R.layout.activity_login);
      sKeys.put("layout/fragment_data_informasi_0", grack.dev.creditpointapp.R.layout.fragment_data_informasi);
      sKeys.put("layout/fragment_data_pelanggaran_0", grack.dev.creditpointapp.R.layout.fragment_data_pelanggaran);
      sKeys.put("layout/fragment_kelas_0", grack.dev.creditpointapp.R.layout.fragment_kelas);
      sKeys.put("layout/item_data_informasi_0", grack.dev.creditpointapp.R.layout.item_data_informasi);
      sKeys.put("layout/item_data_pelanggaran_0", grack.dev.creditpointapp.R.layout.item_data_pelanggaran);
    }
  }
}
