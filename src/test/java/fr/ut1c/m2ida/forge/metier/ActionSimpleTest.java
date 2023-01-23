/*
 * Copyright 2023 David Navarre <David.Navarre@irit.fr>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package fr.ut1c.m2ida.forge.metier;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author David Navarre <David.Navarre@irit.fr>
 */
public class ActionSimpleTest {

    public ActionSimpleTest() {
    }

    @Test
    public void testEnregistrementCoursReturnOK() {
        final ActionSimple as = new ActionSimple("Toto");
        final Jour j1 = new Jour(0, 0);
        final float value = 1.37F;
        as.enrgCours(j1, value);
        final float result = as.valeur(j1);

        Assertions.assertEquals(value, result);
    }

}
