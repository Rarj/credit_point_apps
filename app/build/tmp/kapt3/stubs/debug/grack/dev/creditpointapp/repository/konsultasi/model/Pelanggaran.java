package grack.dev.creditpointapp.repository.konsultasi.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0003JM\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007H\u00c6\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010#\u001a\u00020$H\u00d6\u0001J\t\u0010%\u001a\u00020\u0003H\u00d6\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017\u00a8\u0006&"}, d2 = {"Lgrack/dev/creditpointapp/repository/konsultasi/model/Pelanggaran;", "", "idCreditPoint", "", "idSiswa", "nama", "pelanggaran", "", "Lgrack/dev/creditpointapp/repository/konsultasi/model/PelanggaranMurid;", "waliMurid", "Lgrack/dev/creditpointapp/repository/konsultasi/model/WaliMurid;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getIdCreditPoint", "()Ljava/lang/String;", "setIdCreditPoint", "(Ljava/lang/String;)V", "getIdSiswa", "setIdSiswa", "getNama", "setNama", "getPelanggaran", "()Ljava/util/List;", "setPelanggaran", "(Ljava/util/List;)V", "getWaliMurid", "setWaliMurid", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class Pelanggaran {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id_credit_point")
    private java.lang.String idCreditPoint;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "id_siswa")
    private java.lang.String idSiswa;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "nama")
    private java.lang.String nama;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "pelanggaran")
    private java.util.List<grack.dev.creditpointapp.repository.konsultasi.model.PelanggaranMurid> pelanggaran;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "wali_murid")
    private java.util.List<grack.dev.creditpointapp.repository.konsultasi.model.WaliMurid> waliMurid;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdCreditPoint() {
        return null;
    }
    
    public final void setIdCreditPoint(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getIdSiswa() {
        return null;
    }
    
    public final void setIdSiswa(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNama() {
        return null;
    }
    
    public final void setNama(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<grack.dev.creditpointapp.repository.konsultasi.model.PelanggaranMurid> getPelanggaran() {
        return null;
    }
    
    public final void setPelanggaran(@org.jetbrains.annotations.NotNull()
    java.util.List<grack.dev.creditpointapp.repository.konsultasi.model.PelanggaranMurid> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<grack.dev.creditpointapp.repository.konsultasi.model.WaliMurid> getWaliMurid() {
        return null;
    }
    
    public final void setWaliMurid(@org.jetbrains.annotations.NotNull()
    java.util.List<grack.dev.creditpointapp.repository.konsultasi.model.WaliMurid> p0) {
    }
    
    public Pelanggaran(@org.jetbrains.annotations.Nullable()
    java.lang.String idCreditPoint, @org.jetbrains.annotations.Nullable()
    java.lang.String idSiswa, @org.jetbrains.annotations.Nullable()
    java.lang.String nama, @org.jetbrains.annotations.NotNull()
    java.util.List<grack.dev.creditpointapp.repository.konsultasi.model.PelanggaranMurid> pelanggaran, @org.jetbrains.annotations.NotNull()
    java.util.List<grack.dev.creditpointapp.repository.konsultasi.model.WaliMurid> waliMurid) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<grack.dev.creditpointapp.repository.konsultasi.model.PelanggaranMurid> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<grack.dev.creditpointapp.repository.konsultasi.model.WaliMurid> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final grack.dev.creditpointapp.repository.konsultasi.model.Pelanggaran copy(@org.jetbrains.annotations.Nullable()
    java.lang.String idCreditPoint, @org.jetbrains.annotations.Nullable()
    java.lang.String idSiswa, @org.jetbrains.annotations.Nullable()
    java.lang.String nama, @org.jetbrains.annotations.NotNull()
    java.util.List<grack.dev.creditpointapp.repository.konsultasi.model.PelanggaranMurid> pelanggaran, @org.jetbrains.annotations.NotNull()
    java.util.List<grack.dev.creditpointapp.repository.konsultasi.model.WaliMurid> waliMurid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}