package grack.dev.creditpointapp.preferences

import android.content.Context
import android.preference.PreferenceManager

object SharedPref {
  fun saveUser(userModel: UserPreferences?, context: Context?) {
    val preferences = PreferenceManager.getDefaultSharedPreferences(context)
    val editor = preferences.edit()
    editor.putString("alamat_admin", userModel?.alamatAdmin)
    editor.putString("email_admin", userModel?.emailAdmin)
    editor.putString("id_admin", userModel?.idAdmin)
    editor.putString("level_admin", userModel?.levelAdmin)
    editor.putString("nama_admin", userModel?.namaAdmin)
    editor.putString("password_admin", userModel?.passwordAdmin)
    editor.putString("statusAdmin", userModel?.statusAdmin)
    editor.apply()
  }

  fun getUser(context: Context?): UserPreferences {
    val preferences = PreferenceManager.getDefaultSharedPreferences(context)
    val alamatAdmin = preferences.getString("alamat_admin", "")
    val emailAdmin = preferences.getString("email_admin", "")
    val idAdmin = preferences.getString("id_admin", "")
    val levelAdmin = preferences.getString("level_admin", "")
    val namaAdmin = preferences.getString("nama_admin", "")
    val passwordAdmin = preferences.getString("password_admin", "")
    val statusAdmin = preferences.getString("statusAdmin", "")
    return UserPreferences(
      alamatAdmin,
      emailAdmin,
      idAdmin,
      levelAdmin,
      namaAdmin,
      passwordAdmin,
      statusAdmin
    )
  }

  fun removeUser(context: Context?) {
    val preferences = PreferenceManager.getDefaultSharedPreferences(context)
    preferences.edit().clear().apply()
  }

  fun setUserLoggedIn(ctx: Context?, isAdminLoggedIn: Boolean?) {
    val preferences = PreferenceManager.getDefaultSharedPreferences(ctx)
    val editor = preferences.edit()
    editor.putBoolean("isLoggedIn", isAdminLoggedIn ?: false)
    editor.apply()
  }

  fun getUserLoggedIn(ctx: Context): Boolean? {
    val preferences = PreferenceManager.getDefaultSharedPreferences(ctx)
    return preferences.getBoolean("isLoggedIn", false)
  }

  fun removeUserLoggedIn(ctx: Context?) {
    val preferences = PreferenceManager.getDefaultSharedPreferences(ctx)
    val editor = preferences.edit()
    editor.putBoolean("isLoggedIn", false)
    editor.apply()
  }
}