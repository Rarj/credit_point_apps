package grack.dev.creditpointapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import grack.dev.creditpointapp.databinding.ActivityDetailInformasiBindingImpl;
import grack.dev.creditpointapp.databinding.ActivityDetailSiswaBindingImpl;
import grack.dev.creditpointapp.databinding.ActivityGuruBindingImpl;
import grack.dev.creditpointapp.databinding.ActivityHistoryBindingImpl;
import grack.dev.creditpointapp.databinding.ActivityInputPointBindingImpl;
import grack.dev.creditpointapp.databinding.ActivityKonsultasiBindingImpl;
import grack.dev.creditpointapp.databinding.ActivityLoginBindingImpl;
import grack.dev.creditpointapp.databinding.ActivityReportDailyBindingImpl;
import grack.dev.creditpointapp.databinding.FragmentDataInformasiBindingImpl;
import grack.dev.creditpointapp.databinding.FragmentDataPelanggaranBindingImpl;
import grack.dev.creditpointapp.databinding.FragmentJenisPelanggaranBindingImpl;
import grack.dev.creditpointapp.databinding.FragmentKelasBindingImpl;
import grack.dev.creditpointapp.databinding.FragmentRangkingSiswaBindingImpl;
import grack.dev.creditpointapp.databinding.ItemDataInformasiBindingImpl;
import grack.dev.creditpointapp.databinding.ItemDataKonsultasiSiswaBindingImpl;
import grack.dev.creditpointapp.databinding.ItemDataPelanggaranBindingImpl;
import grack.dev.creditpointapp.databinding.ItemHistoryPelanggaranSiswaBindingImpl;
import grack.dev.creditpointapp.databinding.ItemHistoryPrestasiSiswaBindingImpl;
import grack.dev.creditpointapp.databinding.ItemListGuruBindingImpl;
import grack.dev.creditpointapp.databinding.ItemRangkingSiswaBindingImpl;
import grack.dev.creditpointapp.databinding.ItemReportBindingImpl;
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
  private static final int LAYOUT_ACTIVITYDETAILINFORMASI = 1;

  private static final int LAYOUT_ACTIVITYDETAILSISWA = 2;

  private static final int LAYOUT_ACTIVITYGURU = 3;

  private static final int LAYOUT_ACTIVITYHISTORY = 4;

  private static final int LAYOUT_ACTIVITYINPUTPOINT = 5;

  private static final int LAYOUT_ACTIVITYKONSULTASI = 6;

  private static final int LAYOUT_ACTIVITYLOGIN = 7;

  private static final int LAYOUT_ACTIVITYREPORTDAILY = 8;

  private static final int LAYOUT_FRAGMENTDATAINFORMASI = 9;

  private static final int LAYOUT_FRAGMENTDATAPELANGGARAN = 10;

  private static final int LAYOUT_FRAGMENTJENISPELANGGARAN = 11;

  private static final int LAYOUT_FRAGMENTKELAS = 12;

  private static final int LAYOUT_FRAGMENTRANGKINGSISWA = 13;

  private static final int LAYOUT_ITEMDATAINFORMASI = 14;

  private static final int LAYOUT_ITEMDATAKONSULTASISISWA = 15;

  private static final int LAYOUT_ITEMDATAPELANGGARAN = 16;

  private static final int LAYOUT_ITEMHISTORYPELANGGARANSISWA = 17;

  private static final int LAYOUT_ITEMHISTORYPRESTASISISWA = 18;

  private static final int LAYOUT_ITEMLISTGURU = 19;

  private static final int LAYOUT_ITEMRANGKINGSISWA = 20;

  private static final int LAYOUT_ITEMREPORT = 21;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(21);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.activity_detail_informasi, LAYOUT_ACTIVITYDETAILINFORMASI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.activity_detail_siswa, LAYOUT_ACTIVITYDETAILSISWA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.activity_guru, LAYOUT_ACTIVITYGURU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.activity_history, LAYOUT_ACTIVITYHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.activity_input_point, LAYOUT_ACTIVITYINPUTPOINT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.activity_konsultasi, LAYOUT_ACTIVITYKONSULTASI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.activity_report_daily, LAYOUT_ACTIVITYREPORTDAILY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.fragment_data_informasi, LAYOUT_FRAGMENTDATAINFORMASI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.fragment_data_pelanggaran, LAYOUT_FRAGMENTDATAPELANGGARAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.fragment_jenis_pelanggaran, LAYOUT_FRAGMENTJENISPELANGGARAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.fragment_kelas, LAYOUT_FRAGMENTKELAS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.fragment_rangking_siswa, LAYOUT_FRAGMENTRANGKINGSISWA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.item_data_informasi, LAYOUT_ITEMDATAINFORMASI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.item_data_konsultasi_siswa, LAYOUT_ITEMDATAKONSULTASISISWA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.item_data_pelanggaran, LAYOUT_ITEMDATAPELANGGARAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.item_history_pelanggaran_siswa, LAYOUT_ITEMHISTORYPELANGGARANSISWA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.item_history_prestasi_siswa, LAYOUT_ITEMHISTORYPRESTASISISWA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.item_list_guru, LAYOUT_ITEMLISTGURU);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.item_rangking_siswa, LAYOUT_ITEMRANGKINGSISWA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(grack.dev.creditpointapp.R.layout.item_report, LAYOUT_ITEMREPORT);
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
        case  LAYOUT_ACTIVITYDETAILINFORMASI: {
          if ("layout/activity_detail_informasi_0".equals(tag)) {
            return new ActivityDetailInformasiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detail_informasi is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYDETAILSISWA: {
          if ("layout/activity_detail_siswa_0".equals(tag)) {
            return new ActivityDetailSiswaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detail_siswa is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYGURU: {
          if ("layout/activity_guru_0".equals(tag)) {
            return new ActivityGuruBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_guru is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYHISTORY: {
          if ("layout/activity_history_0".equals(tag)) {
            return new ActivityHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_history is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYINPUTPOINT: {
          if ("layout/activity_input_point_0".equals(tag)) {
            return new ActivityInputPointBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_input_point is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYKONSULTASI: {
          if ("layout/activity_konsultasi_0".equals(tag)) {
            return new ActivityKonsultasiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_konsultasi is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYREPORTDAILY: {
          if ("layout/activity_report_daily_0".equals(tag)) {
            return new ActivityReportDailyBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_report_daily is invalid. Received: " + tag);
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
        case  LAYOUT_FRAGMENTJENISPELANGGARAN: {
          if ("layout/fragment_jenis_pelanggaran_0".equals(tag)) {
            return new FragmentJenisPelanggaranBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_jenis_pelanggaran is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTKELAS: {
          if ("layout/fragment_kelas_0".equals(tag)) {
            return new FragmentKelasBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_kelas is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRANGKINGSISWA: {
          if ("layout/fragment_rangking_siswa_0".equals(tag)) {
            return new FragmentRangkingSiswaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_rangking_siswa is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDATAINFORMASI: {
          if ("layout/item_data_informasi_0".equals(tag)) {
            return new ItemDataInformasiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_data_informasi is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDATAKONSULTASISISWA: {
          if ("layout/item_data_konsultasi_siswa_0".equals(tag)) {
            return new ItemDataKonsultasiSiswaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_data_konsultasi_siswa is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDATAPELANGGARAN: {
          if ("layout/item_data_pelanggaran_0".equals(tag)) {
            return new ItemDataPelanggaranBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_data_pelanggaran is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHISTORYPELANGGARANSISWA: {
          if ("layout/item_history_pelanggaran_siswa_0".equals(tag)) {
            return new ItemHistoryPelanggaranSiswaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_history_pelanggaran_siswa is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHISTORYPRESTASISISWA: {
          if ("layout/item_history_prestasi_siswa_0".equals(tag)) {
            return new ItemHistoryPrestasiSiswaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_history_prestasi_siswa is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMLISTGURU: {
          if ("layout/item_list_guru_0".equals(tag)) {
            return new ItemListGuruBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_list_guru is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRANGKINGSISWA: {
          if ("layout/item_rangking_siswa_0".equals(tag)) {
            return new ItemRangkingSiswaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_rangking_siswa is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMREPORT: {
          if ("layout/item_report_0".equals(tag)) {
            return new ItemReportBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_report is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(10);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "model");
      sKeys.put(2, "modelGuru");
      sKeys.put(3, "modelInformation");
      sKeys.put(4, "modelSiswa");
      sKeys.put(5, "modelWaliMurid");
      sKeys.put(6, "viewModel");
      sKeys.put(7, "viewModelKonsultasi");
      sKeys.put(8, "viewModelPelanggaran");
      sKeys.put(9, "viewModelPrestasi");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(21);

    static {
      sKeys.put("layout/activity_detail_informasi_0", grack.dev.creditpointapp.R.layout.activity_detail_informasi);
      sKeys.put("layout/activity_detail_siswa_0", grack.dev.creditpointapp.R.layout.activity_detail_siswa);
      sKeys.put("layout/activity_guru_0", grack.dev.creditpointapp.R.layout.activity_guru);
      sKeys.put("layout/activity_history_0", grack.dev.creditpointapp.R.layout.activity_history);
      sKeys.put("layout/activity_input_point_0", grack.dev.creditpointapp.R.layout.activity_input_point);
      sKeys.put("layout/activity_konsultasi_0", grack.dev.creditpointapp.R.layout.activity_konsultasi);
      sKeys.put("layout/activity_login_0", grack.dev.creditpointapp.R.layout.activity_login);
      sKeys.put("layout/activity_report_daily_0", grack.dev.creditpointapp.R.layout.activity_report_daily);
      sKeys.put("layout/fragment_data_informasi_0", grack.dev.creditpointapp.R.layout.fragment_data_informasi);
      sKeys.put("layout/fragment_data_pelanggaran_0", grack.dev.creditpointapp.R.layout.fragment_data_pelanggaran);
      sKeys.put("layout/fragment_jenis_pelanggaran_0", grack.dev.creditpointapp.R.layout.fragment_jenis_pelanggaran);
      sKeys.put("layout/fragment_kelas_0", grack.dev.creditpointapp.R.layout.fragment_kelas);
      sKeys.put("layout/fragment_rangking_siswa_0", grack.dev.creditpointapp.R.layout.fragment_rangking_siswa);
      sKeys.put("layout/item_data_informasi_0", grack.dev.creditpointapp.R.layout.item_data_informasi);
      sKeys.put("layout/item_data_konsultasi_siswa_0", grack.dev.creditpointapp.R.layout.item_data_konsultasi_siswa);
      sKeys.put("layout/item_data_pelanggaran_0", grack.dev.creditpointapp.R.layout.item_data_pelanggaran);
      sKeys.put("layout/item_history_pelanggaran_siswa_0", grack.dev.creditpointapp.R.layout.item_history_pelanggaran_siswa);
      sKeys.put("layout/item_history_prestasi_siswa_0", grack.dev.creditpointapp.R.layout.item_history_prestasi_siswa);
      sKeys.put("layout/item_list_guru_0", grack.dev.creditpointapp.R.layout.item_list_guru);
      sKeys.put("layout/item_rangking_siswa_0", grack.dev.creditpointapp.R.layout.item_rangking_siswa);
      sKeys.put("layout/item_report_0", grack.dev.creditpointapp.R.layout.item_report);
    }
  }
}
