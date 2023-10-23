/*
 * XML Type:  getComarcasMunicipiosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetComarcasMunicipiosResponse
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * An XML getComarcasMunicipiosResponse(@http://www.tjsc.jus.br/selo).
 *
 * This is a complex type.
 */
public class GetComarcasMunicipiosResponseImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetComarcasMunicipiosResponse
{
    private static final long serialVersionUID = 1L;
    
    public GetComarcasMunicipiosResponseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMARCASMUNICIPIOS$0 = 
        new javax.xml.namespace.QName("", "comarcasmunicipios");
    
    
    /**
     * Gets array of all "comarcasmunicipios" elements
     */
    public br.jus.tjsc.www.selo.ComarcaMunicipio[] getComarcasmunicipiosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMARCASMUNICIPIOS$0, targetList);
            br.jus.tjsc.www.selo.ComarcaMunicipio[] result = new br.jus.tjsc.www.selo.ComarcaMunicipio[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "comarcasmunicipios" element
     */
    public br.jus.tjsc.www.selo.ComarcaMunicipio getComarcasmunicipiosArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.ComarcaMunicipio target = null;
            target = (br.jus.tjsc.www.selo.ComarcaMunicipio)get_store().find_element_user(COMARCASMUNICIPIOS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "comarcasmunicipios" element
     */
    public int sizeOfComarcasmunicipiosArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMARCASMUNICIPIOS$0);
        }
    }
    
    /**
     * Sets array of all "comarcasmunicipios" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setComarcasmunicipiosArray(br.jus.tjsc.www.selo.ComarcaMunicipio[] comarcasmunicipiosArray)
    {
        check_orphaned();
        arraySetterHelper(comarcasmunicipiosArray, COMARCASMUNICIPIOS$0);
    }
    
    /**
     * Sets ith "comarcasmunicipios" element
     */
    public void setComarcasmunicipiosArray(int i, br.jus.tjsc.www.selo.ComarcaMunicipio comarcasmunicipios)
    {
        generatedSetterHelperImpl(comarcasmunicipios, COMARCASMUNICIPIOS$0, i, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_ARRAYITEM);
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comarcasmunicipios" element
     */
    public br.jus.tjsc.www.selo.ComarcaMunicipio insertNewComarcasmunicipios(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.ComarcaMunicipio target = null;
            target = (br.jus.tjsc.www.selo.ComarcaMunicipio)get_store().insert_element_user(COMARCASMUNICIPIOS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comarcasmunicipios" element
     */
    public br.jus.tjsc.www.selo.ComarcaMunicipio addNewComarcasmunicipios()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.ComarcaMunicipio target = null;
            target = (br.jus.tjsc.www.selo.ComarcaMunicipio)get_store().add_element_user(COMARCASMUNICIPIOS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "comarcasmunicipios" element
     */
    public void removeComarcasmunicipios(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMARCASMUNICIPIOS$0, i);
        }
    }
}
