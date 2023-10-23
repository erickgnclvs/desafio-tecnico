/*
 * XML Type:  getEntesDeclaradosUtilidadePublicaEstadualResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getEntesDeclaradosUtilidadePublicaEstadualResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetEntesDeclaradosUtilidadePublicaEstadualResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetEntesDeclaradosUtilidadePublicaEstadualResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetEntesDeclaradosUtilidadePublicaEstadualResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ENTESDECLARADOSUTILIDADEPUBLICAESTADUAL$0 = 
        new javax.xml.namespace.QName("", "entesDeclaradosUtilidadePublicaEstadual");
    
    
    /**
     * Gets array of all "entesDeclaradosUtilidadePublicaEstadual" elements
     */
    public br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual[] getEntesDeclaradosUtilidadePublicaEstadualArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ENTESDECLARADOSUTILIDADEPUBLICAESTADUAL$0, targetList);
            br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual[] result = new br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "entesDeclaradosUtilidadePublicaEstadual" element
     */
    public br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual getEntesDeclaradosUtilidadePublicaEstadualArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual target = null;
            target = (br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual)get_store().find_element_user(ENTESDECLARADOSUTILIDADEPUBLICAESTADUAL$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "entesDeclaradosUtilidadePublicaEstadual" element
     */
    public int sizeOfEntesDeclaradosUtilidadePublicaEstadualArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTESDECLARADOSUTILIDADEPUBLICAESTADUAL$0);
        }
    }
    
    /**
     * Sets array of all "entesDeclaradosUtilidadePublicaEstadual" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEntesDeclaradosUtilidadePublicaEstadualArray(br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual[] entesDeclaradosUtilidadePublicaEstadualArray)
    {
        check_orphaned();
        arraySetterHelper(entesDeclaradosUtilidadePublicaEstadualArray, ENTESDECLARADOSUTILIDADEPUBLICAESTADUAL$0);
    }
    
    /**
     * Sets ith "entesDeclaradosUtilidadePublicaEstadual" element
     */
    public void setEntesDeclaradosUtilidadePublicaEstadualArray(int i, br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual entesDeclaradosUtilidadePublicaEstadual)
    {
        generatedSetterHelperImpl(entesDeclaradosUtilidadePublicaEstadual, ENTESDECLARADOSUTILIDADEPUBLICAESTADUAL$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "entesDeclaradosUtilidadePublicaEstadual" element
     */
    public br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual insertNewEntesDeclaradosUtilidadePublicaEstadual(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual target = null;
            target = (br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual)get_store().insert_element_user(ENTESDECLARADOSUTILIDADEPUBLICAESTADUAL$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "entesDeclaradosUtilidadePublicaEstadual" element
     */
    public br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual addNewEntesDeclaradosUtilidadePublicaEstadual()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual target = null;
            target = (br.jus.tjsc.www.selo.EnteDeclaradoUtilidadePublicaEstadual)get_store().add_element_user(ENTESDECLARADOSUTILIDADEPUBLICAESTADUAL$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "entesDeclaradosUtilidadePublicaEstadual" element
     */
    public void removeEntesDeclaradosUtilidadePublicaEstadual(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTESDECLARADOSUTILIDADEPUBLICAESTADUAL$0, i);
        }
    }
}
