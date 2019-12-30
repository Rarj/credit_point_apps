package grack.dev.creditpointapp.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\f\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0010\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0011\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001f\u0010\u0015\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\u0017\u00a8\u0006\u0019"}, d2 = {"Lgrack/dev/creditpointapp/preferences/SharedPref;", "", "()V", "getUser", "Lgrack/dev/creditpointapp/preferences/UserPreferences;", "context", "Landroid/content/Context;", "getUserLoggedIn", "", "ctx", "(Landroid/content/Context;)Ljava/lang/Boolean;", "getUserLoggedInWaliMurid", "getWaliMurid", "Lgrack/dev/creditpointapp/preferences/WaliMuridPreferences;", "removeUser", "", "removeUserLoggedIn", "removeUserLoggedInWaliMurid", "saveUser", "userModel", "saveWaliMurid", "setUserLoggedIn", "isAdminLoggedIn", "(Landroid/content/Context;Ljava/lang/Boolean;)V", "setUserLoggedInWaliMurid", "app_debug"})
public final class SharedPref {
    public static final grack.dev.creditpointapp.preferences.SharedPref INSTANCE = null;
    
    public final void saveUser(@org.jetbrains.annotations.Nullable()
    grack.dev.creditpointapp.preferences.UserPreferences userModel, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final grack.dev.creditpointapp.preferences.UserPreferences getUser(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    public final void saveWaliMurid(@org.jetbrains.annotations.Nullable()
    grack.dev.creditpointapp.preferences.WaliMuridPreferences userModel, @org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final grack.dev.creditpointapp.preferences.WaliMuridPreferences getWaliMurid(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        return null;
    }
    
    public final void removeUser(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
    }
    
    public final void setUserLoggedIn(@org.jetbrains.annotations.Nullable()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isAdminLoggedIn) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getUserLoggedIn(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return null;
    }
    
    public final void setUserLoggedInWaliMurid(@org.jetbrains.annotations.Nullable()
    android.content.Context ctx, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean isAdminLoggedIn) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getUserLoggedInWaliMurid(@org.jetbrains.annotations.NotNull()
    android.content.Context ctx) {
        return null;
    }
    
    public final void removeUserLoggedInWaliMurid(@org.jetbrains.annotations.Nullable()
    android.content.Context ctx) {
    }
    
    public final void removeUserLoggedIn(@org.jetbrains.annotations.Nullable()
    android.content.Context ctx) {
    }
    
    private SharedPref() {
        super();
    }
}