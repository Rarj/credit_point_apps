package grack.dev.creditpointapp.repository.datainformasi.model


import com.google.gson.annotations.SerializedName

data class Information(
    @SerializedName("content")
    var content: String?,
    @SerializedName("created_by")
    var createdBy: String?,
    @SerializedName("created_date")
    var createdDate: String?,
    @SerializedName("date")
    var date: String?,
    @SerializedName("deleted_by")
    var deletedBy: Any?,
    @SerializedName("deleted_date")
    var deletedDate: Any?,
    @SerializedName("id_information")
    var idInformation: String?,
    @SerializedName("is_delete")
    var isDelete: String?,
    @SerializedName("judul_information")
    var judulInformation: String?,
    @SerializedName("updated_by")
    var updatedBy: Any?,
    @SerializedName("updated_date")
    var updatedDate: Any?
)