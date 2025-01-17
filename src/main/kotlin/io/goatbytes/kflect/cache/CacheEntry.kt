/*
 * Copyright (c) 2024 GoatBytes.IO
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package io.goatbytes.kflect.cache

/**
 * Data class `CacheEntry` represents an entry in a cache.
 *
 * @property value      The value to cache
 * @property timestamp  The timestamp in milliseconds when the entry was added to or retrieved from
 *                      the cache.
 *                      Defaults to the current system time.
 */
data class CacheEntry(val value: Any, var timestamp: Long = System.currentTimeMillis())
