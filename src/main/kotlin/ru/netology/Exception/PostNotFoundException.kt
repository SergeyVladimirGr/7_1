package ru.netology.Exception

import java.lang.RuntimeException


class PostNotFoundException(message: String): RuntimeException(message)