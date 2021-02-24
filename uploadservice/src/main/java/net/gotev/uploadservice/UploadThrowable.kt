package net.gotev.uploadservice

open class UploadThrowable(override val message: String, val httpMethod: String, val exception: Exception?) : Throwable(message)
