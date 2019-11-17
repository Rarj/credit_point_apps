package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new grack.dev.creditpointapp.DataBinderMapperImpl());
  }
}
