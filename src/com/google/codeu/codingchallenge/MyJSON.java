// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.codeu.codingchallenge;

import java.util.Collection;

final class MyJSON implements JSON {

Map<string,JSON> hash = new Map<string,JSON>();
  
  @Override
  public JSON getObject(String name) {
    return hash.get(name);
  }

  @Override
  public JSON setObject(String name, JSON value) {
    hash.put(name,value);
    return this;
  }

  @Override
  public String getString(String name) {
    return hash.get(name);
  }

  @Override
  public JSON setString(String name, String value) {
    string assign;
    assign += "\"";
    assign += name;
    assign += "\"";
    assign += ":";
    assign += " \"";
    assign += value;
    assign += "\"";
    hash.put(name,value)
    return assign;
  }

  @Override
  public void getObjects(Collection<String> names) {
  }

  @Override
  public void getStrings(Collection<String> names) {
    // TODO: implement this
  }
}
