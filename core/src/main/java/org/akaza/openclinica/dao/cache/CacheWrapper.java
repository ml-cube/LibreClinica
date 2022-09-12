/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.dao.cache;

public interface CacheWrapper<K, V> {
    
    V get(final K key);
    void put(final K key,final V value);

}
